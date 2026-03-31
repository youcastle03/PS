import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void rotateLeft(Deque<Integer> deque) {
        if (!deque.isEmpty()) {
            int pollNumber = (int) deque.pollLast();
            deque.addFirst(pollNumber);
        }
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        Scanner scanner = new Scanner(System.in);

        int N, M;
        N = scanner.nextInt();
        M = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        int answer = 0;
        for (int j = 0; j < M; j++) {
            int popNumber = scanner.nextInt();
            int dequeSize = deque.size();
            int count = 0;

            while (popNumber != deque.peekFirst()) {
                rotateLeft(deque);
                count++;
            }

            if (count > dequeSize - count) count = dequeSize - count;
            answer += count;
            deque.pollFirst();
        }
        System.out.println(answer);
    }
}