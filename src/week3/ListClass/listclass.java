package week3.ListClass;

public class listclass {
    public static class MyList<T> {
        private T[] array;
        private int size;
        private int capacity;

        // Varsayılan constructor
        public MyList() {
            this(10);
        }

        // Kapasiteyi dışarıdan alan constructor
        public MyList(int capacity) {
            this.capacity = capacity;
            this.array = (T[]) new Object[capacity];
            this.size = 0;
        }

        public int size() {
            return this.size;
        }

        public int getCapacity() {
            return this.capacity;
        }

        public void add(T data) {
            if (size >= capacity) {
                expandCapacity();
            }
            array[size++] = data;
        }

        private void expandCapacity() {
            capacity *= 2;
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        public T get(int index) {
            if (index < 0 || index >= size) return null;
            return array[index];
        }

        public T remove(int index) {
            if (index < 0 || index >= size) return null;
            T removed = array[index];
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
            return removed;
        }

        public T set(int index, T data) {
            if (index < 0 || index >= size) return null;
            T old = array[index];
            array[index] = data;
            return old;
        }

        @Override
        public String toString() {
            if (size == 0) return "[]";
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                sb.append(array[i]);
                if (i < size - 1) sb.append(",");
            }
            sb.append("]");
            return sb.toString();
        }

        public int indexOf(T data) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null && data == null) return i;
                if (array[i] != null && array[i].equals(data)) return i;
            }
            return -1;
        }

        public int lastIndexOf(T data) {
            for (int i = size - 1; i >= 0; i--) {
                if (array[i] == null && data == null) return i;
                if (array[i] != null && array[i].equals(data)) return i;
            }
            return -1;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public T[] toArray() {
            T[] result = (T[]) new Object[size];
            for (int i = 0; i < size; i++) {
                result[i] = array[i];
            }
            return result;
        }

        public void clear() {
            for (int i = 0; i < size; i++) {
                array[i] = null;
            }
            size = 0;
        }

        public MyList<T> subList(int start, int finish) {
            if (start < 0 || finish >= size || start > finish) return null;
            MyList<T> sub = new MyList<>(finish - start + 1);
            for (int i = start; i <= finish; i++) {
                sub.add(array[i]);
            }
            return sub;
        }

        public boolean contains(T data) {
            return indexOf(data) != -1;
        }
    }

}
