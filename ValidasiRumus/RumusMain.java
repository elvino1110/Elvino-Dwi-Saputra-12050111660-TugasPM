package ValidasiRumus;

import java.util.Scanner;

public class RumusMain {
    public static void main(String[] args) {

        String rumus = "f(x)=(2x+y)-(3+(2x-x)+20)";
        Scanner input = new Scanner(rumus);
        System.out.println("Rumus : " + rumus);
        StackRumus<String> stack = new StackRumus<>(rumus.length());

        input.useDelimiter("");

        for (int i = 0; i < rumus.length(); i++) {
            String karakter = input.next();
            if (karakter.equals("{") | karakter.equals("[") | karakter.equals("(")){
                stack.push("{");
                stack.push("[");
                stack.push("(");
            } else if (karakter.equals("}") | karakter.equals("]") | karakter.equals(")")){
                stack.pop();
                stack.pop();
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            System.out.println("Status Validasi : Valid");
        } else {
            System.out.println("Status Validasi : Tidak Valid");
        }
    }
}