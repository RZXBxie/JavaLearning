package com.itheima;

public class PersonTest {
	public static void main(String[] args) {
		TennisPlayer tennisPlayer = new TennisPlayer("张继科", 22);
		System.out.println(tennisPlayer.getName() + ", " + tennisPlayer.getAge());
		tennisPlayer.learn();
		tennisPlayer.say();

		TennisCoach tennisCoach = new TennisCoach("刘国梁", 32);
		System.out.println(tennisCoach.getName() + ", " + tennisCoach.getAge());
		tennisCoach.teach();
		tennisCoach.say();

		BasketBallPlayer basketBallPlayer = new BasketBallPlayer("林书豪", 22);
		System.out.println(basketBallPlayer.getName() + ", " + basketBallPlayer.getAge());
		basketBallPlayer.learn();

		BasketBallCoach basketBallCoach = new BasketBallCoach("姚明", 33);
		System.out.println(basketBallCoach.getName() + ", " + basketBallCoach.getAge());
		basketBallCoach.teach();
	}
}
