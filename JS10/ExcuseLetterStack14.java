public class ExcuseLetterStack14 {
    ExcuseLetter14[] stack;
    int top, size;
    public ExcuseLetterStack14(int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter14[size];
    }

    boolean isFull() {
        return top == size -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(ExcuseLetter14 std) {
        if(!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!");
        }
    }

    ExcuseLetter14 pop() {
        if(!isEmpty()) {
            ExcuseLetter14 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    ExcuseLetter14 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else { 
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    void searchByName(String name) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                System.out.println("Excuse letter found:");
                stack[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No letter found for student: " + name);
        }
    }
}
