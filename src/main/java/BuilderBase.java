

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.Set;

public class BuilderBase {
    public static void main(String[] args) {
        BuilderExample builderExample = BuilderExample.builder()
                .age(21)
                .name("Mike")
                .build();;

        System.out.print(builderExample.getAge());

    }
}


@Builder
@Getter
class BuilderExample {
    @Builder.Default
    private long created = System.currentTimeMillis();
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;
}
