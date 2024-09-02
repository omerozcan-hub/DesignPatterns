public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        Sorter sorter = new Sorter();

        sorter.setStrategy(new BubbleSortStrategy());
        sorter.sort(numbers);

        sorter.setStrategy(new QuickSortStrategy());
        sorter.sort(numbers);
    }
}