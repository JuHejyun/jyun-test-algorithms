package com.jyun.test.algorithms.nowcoder;

import org.junit.Test;

public class Test01 {


	@Test
	public void testReplaceSpace(){
		String s = replaceSpace(new StringBuffer("a b n   c"));
		System.out.println(s);
	}



	public String replaceSpace(StringBuffer str) {
		int P1 = str.length() - 1;
		for (int i = 0; i <= P1; i++)
			if (str.charAt(i) == ' ')
				str.append("  ");

		int P2 = str.length() - 1;
		while (P1 >= 0 && P2 > P1) {
			char c = str.charAt(P1--);
			if (c == ' ') {
				str.setCharAt(P2--, '0');
				str.setCharAt(P2--, '2');
				str.setCharAt(P2--, '%');
			} else {
				str.setCharAt(P2--, c);
			}
		}
		return str.toString();
	}


	public ListNode deleteDuplication(ListNode pHead) {
		if (pHead == null || pHead.next == null)
			return pHead;
		ListNode next = pHead.next;
		if (pHead.data == next.data) {
			while (next != null && pHead.data == next.data)
				next = next.next;
			return deleteDuplication(next);
		} else {
			pHead.next = deleteDuplication(pHead.next);
			return pHead;
		}
	}




}
