class Main
{
    public static void main(String[] args) {
        StackDemo st = new StackDemo(1);
        st.push(34);
        st.push(55);
        st.push(67);
        st.push(88);
        st.pop();
        st.pop();
        st.traverse();
    }

}