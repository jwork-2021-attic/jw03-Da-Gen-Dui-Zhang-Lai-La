package example;

public class SelectionSorter implements Sorter{

      private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
        for(int i=0;i<a.length;i++){
            int minIndex = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex=j;
                }
            }
            swap(i, minIndex);
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}