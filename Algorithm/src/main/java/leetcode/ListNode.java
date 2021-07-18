package leetcode;

import java.util.Objects;

public class ListNode extends Object {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListNode)) {
            return false;
        }
        ListNode listNode = (ListNode) obj;
        ListNode that = this;
        while (that.next != null) {
            if (that.val == listNode.val) {
                that = that.next;
                listNode = listNode.next;
            } else {
                return false;
            }
        }
        if (listNode.next == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
