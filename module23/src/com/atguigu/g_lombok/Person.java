package com.atguigu.g_lombok;

import lombok.*;

/**
 * @author likang
 * @create 2024-11-29 10:43
 * @function
 */
/*@Getter
@Setter
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private Integer age;
}
