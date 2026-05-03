public class App {
    public static void main(String[] args) throws Exception {
        try {
            StackADT obj = new ArrayStack(6);
            obj.push(1);
            obj.push(1);
            obj.push(1);
            obj.push(1);
            obj.push(1);
            obj.push(1);
            obj.push(1);
            System.out.println(obj.pop());

            System.out.println(obj.pop());
            System.out.println("Size: " + obj.size());
        } catch (StackOverflowException e) {
            System.out.println("Warning: " + e.getMessage());
        } catch (StackUnderflowException e) {
            System.out.println("Warning: " + e.getMessage());
        }
    }
}
