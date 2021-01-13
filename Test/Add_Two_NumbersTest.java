import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Add_Two_NumbersTest {

    public Add_Two_Numbers addTwoNumbers = new Add_Two_Numbers();

    @Test
    void addTwoNumbers() {
        //test1
        Add_Two_Numbers.ListNode l1 =
                new Add_Two_Numbers.ListNode(2,
                        new Add_Two_Numbers.ListNode(4,
                                new Add_Two_Numbers.ListNode(3)));

        Add_Two_Numbers.ListNode l2 =
                new Add_Two_Numbers.ListNode(5,
                        new Add_Two_Numbers.ListNode(6,
                                new Add_Two_Numbers.ListNode(4)));

        Add_Two_Numbers.ListNode answer1 =
                new Add_Two_Numbers.ListNode(7,
                        new Add_Two_Numbers.ListNode(0,
                                new Add_Two_Numbers.ListNode(8)));

        Add_Two_Numbers.ListNode retListNode = addTwoNumbers.addTwoNumbers(l1, l2);

        while (answer1 != null) {
            assertEquals(answer1.val, retListNode.val);
            answer1 = answer1.next;
            retListNode = retListNode.next;
        }

        //test2
        Add_Two_Numbers.ListNode l1_2 =
                new Add_Two_Numbers.ListNode(0);

        Add_Two_Numbers.ListNode l2_2 =
                new Add_Two_Numbers.ListNode(0);

        Add_Two_Numbers.ListNode answer1_2 =
                new Add_Two_Numbers.ListNode(0);

        Add_Two_Numbers.ListNode retListNode_2 = addTwoNumbers.addTwoNumbers(l1_2, l2_2);

        while (answer1_2 != null) {
            assertEquals(answer1_2.val, retListNode_2.val);
            answer1_2 = answer1_2.next;
            retListNode_2 = retListNode_2.next;
        }

        //test3
        Add_Two_Numbers.ListNode l1_3 =
                    new Add_Two_Numbers.ListNode(9,
                    new Add_Two_Numbers.ListNode(9,
                    new Add_Two_Numbers.ListNode(9,
                    new Add_Two_Numbers.ListNode(9,
                    new Add_Two_Numbers.ListNode(9,
                    new Add_Two_Numbers.ListNode(9,
                    new Add_Two_Numbers.ListNode(9
                )))))));

        Add_Two_Numbers.ListNode l2_3 =
                new Add_Two_Numbers.ListNode(9,
                        new Add_Two_Numbers.ListNode(9,
                                new Add_Two_Numbers.ListNode(9,
                                        new Add_Two_Numbers.ListNode(9))));

        Add_Two_Numbers.ListNode answer1_3 =
                    new Add_Two_Numbers.ListNode(8,
                    new Add_Two_Numbers.ListNode(9,
                    new Add_Two_Numbers.ListNode(9,
                    new Add_Two_Numbers.ListNode(9,
                    new Add_Two_Numbers.ListNode(0,
                    new Add_Two_Numbers.ListNode(0,
                    new Add_Two_Numbers.ListNode(0,
                    new Add_Two_Numbers.ListNode(1
                ))))))));

        Add_Two_Numbers.ListNode retListNode_3 = addTwoNumbers.addTwoNumbers(l1_3, l2_3);

        while (answer1_3 != null) {

            assertEquals(answer1_3.val, retListNode_3.val);
            answer1_3 = answer1_3.next;
            retListNode_3 = retListNode_3.next;
        }
    }
}