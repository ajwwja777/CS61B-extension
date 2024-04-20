public class DList {
    private Node head;
    private int size;

    // 内部节点类
    private static class Node {
        int value;
        Node next;
        Node down;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.down = null;
        }
    }

    // 向 DList 中添加元素的方法
    public void add(int element) {
        // 如果 DList 为空，则创建新的节点作为头节点
        if (head == null) {
            head = new Node(element);
            size++;
            return;
        }

        // 尝试将元素添加到最底部的 DList
        Node current = head;
        while (current.down != null) {
            current = current.down;
        }

        // 将元素添加到当前行
        current.next = new Node(element);
        size++;

        // 如果当前行长度大于下一行，则将元素移动到下一行
        while (size > getSizeOfNextRow(current)) {
            current = current.next;
            current.down = new Node(element);
            size--;
        }
    }

    // 获取下一行的大小
    private int getSizeOfNextRow(Node node) {
        if (node.next == null) {
            return 0;
        }
        return getSize(node.next);
    }

    // 获取 DList 中指定行的大小
    private int getSize(Node node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // 创建一个二维 DList
        DList dList = new DList();

        // 向 DList 中添加一些元素
        dList.add(1);
        dList.add(2);
        dList.add(3);
        dList.add(4);
        dList.add(5);
        dList.add(6);
        dList.add(7);
        dList.add(8);
        dList.add(9);
        dList.add(10);
        dList.add(11);

        // 打印 DList 中的元素
        printDList(dList);
    }

    // 打印 DList 中的元素
    private static void printDList(DList dList) {
        DList.Node current = dList.head;
        while (current != null) {
            printRow(current);
            current = current.down;
        }
    }

    // 打印指定行中的元素
    private static void printRow(DList.Node node) {
        DList.Node current = node;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
