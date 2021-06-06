import java.io.UnsupportedEncodingException;


import lombok.SneakyThrows;
public class SneakyThrowsBase {
    public static void main(String[] args) {
        SneakyThrowsExample sneakyThrowsExample = new SneakyThrowsExample();
    }
}


class SneakyThrowsExample implements Runnable {
    @SneakyThrows(UnsupportedEncodingException.class)
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    @SneakyThrows
    public void run() {
        throw new Throwable();
    }
}