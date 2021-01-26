package p20201125;

public class 주식가격 {
	public int[] solution(int[] prices) {
		
		int[] answer = new int[prices.length];
		
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < answer.length; j++) {
				answer[i]++;
				if (prices[i] > prices[j]) break;
			}
		}

		return answer;
	}
}