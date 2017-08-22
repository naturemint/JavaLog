package jp.techacademy.hiroki.ooyama.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {

    static String to_jp = "人間";
    String hobby;

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public static void introduce() {
         Log.d("javatest", "これは人間クラスです。");
    }

    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + hobby + "について考える。");
    }

}
