package com.ssk.examples.others;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AverageScores {

	HashMap students = new HashMap();

	public void findAverage(String student_id) {

		Node scores = (Node) students.get(student_id);

		if (scores != null) {
			System.out.println(scores.toString());
		}
	}

	public static void main(String[] args) {

		AverageScores s = new AverageScores();
		List results = s.getScores();

		for (Iterator iterator = results.iterator(); iterator.hasNext();) {
			Test result = (Test) iterator.next();
			Node scores = (Node) s.students.get(result.student_id);
			scores = s.addScore(scores, result);
			s.students.put(result.student_id, scores);
		}

		s.findAverage("JACK");
	}

	private List<Test> getScores() {

		List<Test> result = new ArrayList<Test>();

		Test r1 = new Test(50, "JACK", new Date(2014, 05, 15));
//		Test r2 = new Test(50, "SMITH", new Date(2014, 05, 15));
//		Test r3 = new Test(50, "KEVIN", new Date(2014, 05, 15));
		Test r4 = new Test(52, "JACK", new Date(2014, 05, 15));
		Test r5 = new Test(43, "JACK", new Date(2014, 05, 15));
		Test r6 = new Test(60, "JACK", new Date(2014, 05, 15));
		Test r7 = new Test(65, "JACK", new Date(2014, 05, 15));
		Test r8 = new Test(40, "JACK", new Date(2014, 05, 15));
//		Test r9 = new Test(30, "KEVIN", new Date(2014, 05, 15));
//		Test r10 = new Test(20, "KEVIN", new Date(2014, 05, 15));
//		Test r11 = new Test(70, "KEVIN", new Date(2014, 05, 15));
//		Test r12 = new Test(90, "SMITH", new Date(2014, 05, 15));
//		Test r13 = new Test(55, "SMITH", new Date(2014, 05, 15));
//		Test r14 = new Test(25, "SIMTH", new Date(2014, 05, 15));
//		Test r15 = new Test(65, "SMITH", new Date(2014, 05, 15));
		result.add(r1);
//		result.add(r2);
//		result.add(r3);
		result.add(r4);
		result.add(r5);
		result.add(r6);
		result.add(r7);
		result.add(r8);
//		result.add(r9);
//		result.add(r10);
//		result.add(r11);
//		result.add(r12);
//		result.add(r13);
//		result.add(r14);
//		result.add(r15);

		return result;
	}

	public Node addScore(Node scores, Test result) {
		System.out.println("AverageScores.addScore()" + result.student_id
				+ ", score: " + result.score);
		
		if (scores != null) {
			Node scoreNode = scores;
			while (scoreNode != null) {
				if (scoreNode.score > result.score) {
					if (scoreNode.next == null) {
						Node s = new Node(result.score, result.date);
						scoreNode.next = s;
						break;
					}
					scoreNode = scoreNode.next;
				} else if(scoreNode.score < result.score){
					Node s = new Node(result.score, result.date);
					s.next = scoreNode.next;
					scoreNode.next = s;
					break;
				}
//				scoreNode = scoreNode.next;
			}

		} else {
			scores = new Node(result.score, result.date);
		}
		System.out.println(scores.toString());
		 return scores;
	}

	private class Test {
		public int score;
		public String student_id;
		public Date date;

		public Test(int score, String sutdent_id, Date date) {
			this.score = score;
			this.student_id = sutdent_id;
			this.date = date;
		}
	}

	private class Node {
		int score;
		Date date;
		public Node next;

		public Node(int score, Date date) {
			this.score = score;
			this.date = date;
		}

		public String toString() {

			StringBuffer buf = new StringBuffer();
			Node n = this;

			while (n != null) {
				buf.append(n.score);
				if (n.next != null)
					buf.append("-->");
				n = n.next;
			}
			return buf.toString();
		}
	}
}