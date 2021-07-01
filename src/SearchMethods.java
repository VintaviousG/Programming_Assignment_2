    public class SearchMethods {

        /*
         * We will use these methods for the user to search for the car which we be stored in a ArrayList
         * That will converted into an array
         *
         * */


        public static <T extends Comparable<T>> int linearSearch(T[] data, int min, int max, T target) {

            for (int i = min; i <= max; i++) {
                if (data[i].compareTo(target) == 0) {
                    return i;
                }
            }

            return -1;

        }


        public static <T extends Comparable<T>> int binarySearch(T[] data, int min, int max, T target) {

                while (min < max){
                    int mid  = (min + max) / 2;
                    int cmp = data[mid].compareTo(target);

                    if (cmp < 0){
                      min = mid + 1;
                    } else if (cmp > 0){
                            max = mid - 1;
                    } else {
                        return mid;
                    }

                }
                return -1;

        }



}





