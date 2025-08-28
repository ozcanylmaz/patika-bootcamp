package week3.Opsiyonel;

public class MyList<T> {
    private T[] array;
    private int size;
    private int capacity;

    // 1️⃣ Constructorlar
    @SuppressWarnings("unchecked")
    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
        this.size = 0;
    }

    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
        this.size = 0;
    }

    // 2️⃣ size ve getCapacity
    public int size() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    // 3️⃣ Kapasiteyi kontrol edip gerekirse artır
    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (size >= capacity) {
            capacity *= 2;
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    // 4️⃣ Eleman ekleme
    public void add(T data) {
        ensureCapacity();
        array[size++] = data;
    }

    // 5️⃣ Verilen indisteki değeri döndürür
    public T get(int index) {
        if (index < 0 || index >= size) return null;
        return array[index];
    }

    // 6️⃣ Verilen indisteki değeri değiştirme
    public T set(int index, T data) {
        if (index < 0 || index >= size) return null;
        T old = array[index];
        array[index] = data;
        return old;
    }

    // 7️⃣ Verilen indisteki elemanı silme
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

    // 8️⃣ Listeyi string olarak yazdırma
    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // 9️⃣ İlk indeksi bulma
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) return i;
        }
        return -1;
    }

    // 🔟 Son indeksi bulma
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) return i;
        }
        return -1;
    }

    // 1️⃣1️⃣ Liste boş mu kontrol
    public boolean isEmpty() {
        return size == 0;
    }

    // 1️⃣2️⃣ Eleman var mı kontrol
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    // 1️⃣3️⃣ Listeyi tamamen temizleme
    @SuppressWarnings("unchecked")
    public void clear() {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    // 1️⃣4️⃣ Listeyi array’e çevirme
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // 1️⃣5️⃣ Alt liste oluşturma
    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) return null;
        MyList<T> sub = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sub.add(array[i]);
        }
        return sub;
    }
}
