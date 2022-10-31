public class hello_world {
    public static void main(String[] args) {
        String line = ">gi|49175990|ref|NC_000913.2| Escherichia coli K12 substr. MG1655, complete genome";
        System.out.println(line.contains(">gi"));
    }
}
