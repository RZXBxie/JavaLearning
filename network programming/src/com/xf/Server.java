package com.xf;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(6666);
		ThreadPool pool = new ThreadPool();
		System.out.println("Server is running...");
		while (true) {
			Socket s = ss.accept();
			System.out.println("connected from " + s.getRemoteSocketAddress());
			pool.submit(new Handler(s));
		}
	}
}

class Handler implements Runnable {
	private Socket socket;
	public Handler(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (InputStream in = this.socket.getInputStream()) {
			try (OutputStream out = this.socket.getOutputStream()) {
				handle(in, out);
			}
		} catch (Exception e) {
			try {
				this.socket.close();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
			System.out.println("client disconnected");
		}
	}

	private void handle(InputStream in, OutputStream out) throws IOException {
		var writer = new BufferedWriter(new OutputStreamWriter(out, StandardCharsets.UTF_8));
		var reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
		writer.write("hello\n");
		writer.flush();
		while (true) {
			String s = reader.readLine();
			if (s.equals("bye")) {
				writer.write("bye\n");
				writer.flush();
				break;
			}
			writer.write("ok" + s + "\n");
			writer.flush();
		}
	}
}
