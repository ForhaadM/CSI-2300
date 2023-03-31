public class messingAround {
    public static void main(String[] args) throws Exception {​

        int [] arrayList = new ArrayList<>();​

        for (int i = 0; i < 3; i ++) {​

            arrayList.add(i+10);​

        }​

        try {​

            System.out.println(arrayList.get(10));​

        } catch (Exception e) {​

            System.out.print("Something went wrong! ");​

        } finally {​

            System.out.print("Finally print: ");​

            for (int a : arrayList) {​

                System.out.print(a + " ");​

            }​

        }​

    }
    
}
