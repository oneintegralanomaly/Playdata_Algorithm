package com.week001;
import java.util.*;

public class Stock_Price
{
	public int[] solution(int[] prices)
	{

		LinkedList<Integer> qi = new LinkedList<>();
		for (int a : prices)
			qi.add(a);

		int[] answer = new int[prices.length];

		for (int i = 0, j = prices.length - 1; i < j; i++)
		{
			if (qi.peek() == 1)
			{
				answer[i] = qi.size() - 1;
				qi.poll();
				continue;
			}

			int x = qi.poll();
			int bc = 0;
			for (int b : qi)
			{
				if (x > b)
				{
					answer[i] = (bc + 1);
					break;
				}
				answer[i] = qi.size();
				bc++;
			}
			answer[prices.length - 1] = 0;
		}
		return answer;
	}

}
