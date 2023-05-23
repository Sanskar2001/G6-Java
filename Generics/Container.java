class Container<T> {
    
    T value;
    public Container(T value)
    {
        this.value=value;
    }

    void displayValue()
    {
        System.out.println(this.value);
    }
}
