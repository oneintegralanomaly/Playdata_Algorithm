package com.week001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Features
{
	public int[] solution(int[] progresses, int[] speeds)
	{

		Queue<Integer> dayq = new LinkedList<>();
		ArrayList<Integer> answer_al = new ArrayList<>();

		for (int i = 0, j = speeds.length; i < j; i++)
		{
			dayq.offer((int) Math.ceil((100 - progresses[i]) / (double) speeds[i]));
		}

		while (dayq.size() != 0)
		{
			int squad_cnt = 1;
			int vanguard = dayq.poll();

			if (dayq.size() > 0)
			{
				while (vanguard >= dayq.peek())
				{
					dayq.poll();
					squad_cnt++;
					if (dayq.size() == 0)
						break;
				}
			} else if (dayq.size() == 0)
			{
				answer_al.add(squad_cnt);
				break;
			}
			answer_al.add(squad_cnt);
		}

		int[] answer = answer_al.stream().mapToInt(i -> i).toArray();
		return answer;
	}

	public static void main(String[] args)
	{
		Features feat = new Features();

		int[] progresses00 =
		{ 93, 30, 55 };
		int[] speeds00 =
		{ 1, 30, 5 };
		int[] answer00 =
		{ 2, 1 };

		int[] progresses01 =
		{ 95, 90, 99, 99, 80, 99 };
		int[] speeds01 =
		{ 1, 1, 1, 1, 1, 1 };
		int[] answer01 =
		{ 1, 3, 2 };
		
		int[] ax = feat.solution(progresses00, speeds00);
		
		for (int a : ax)
			System.out.println(a);
		
		if(Arrays.equals(ax, answer00))
		{
			System.out.println(true);
		}
		
		
	}

}
