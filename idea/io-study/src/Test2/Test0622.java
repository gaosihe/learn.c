package Test2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Test0622 {
        private static class User {
            String name;
            Integer score;
            User (String name, Integer score){
                this.name = name;
                this.score = score;
            }
            @Override
            public String toString() {
                return name + " " + score;
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String string;
            while((string = reader.readLine()) != null){
                // 数目
                int count = Integer.parseInt(string);
                // 降序：0，升序：1
                int sortFlag = Integer.parseInt(reader.readLine());

                // 存储
                User[] users = new User[count];
                for (int i = 0; i < count; i++) {
                    String[] line = reader.readLine().split(" ");
                    users[i] = new User(line[0], Integer.parseInt(line[1]));
                }

                // 排序
                if(sortFlag == 1){
                    Arrays.sort(users, Comparator.comparingInt(o -> o.score));
                } else {
                    Arrays.sort(users, (o1, o2) -> o2.score - o1.score);
                }

                // 打印
                for (User user : users) {
                    System.out.println(user);
                }
            }
        }
}
