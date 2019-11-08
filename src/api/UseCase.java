package api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义注解 @Target：
 * 表示该注解可以用于什么地方，可能的ElementType参数有：<br>
 * CONSTRUCTOR：构造器的声明 <br>
 * FIELD：域声明（包括enum实例）<br>
 * LOCAL_VARIABLE：局部变量声明<br>
 * METHOD：方法声明<br>
 * PACKAGE：包声明 <br>
 * PARAMETER：参数声明<br>
 * TYPE：类、接口（包括注解类型）或enum声明
 * 
 * @Retention
 * 			表示需要在什么级别保存该注解信息。可选的RetentionPolicy参数包括：<br>
 *            SOURCE：注解将被编译器丢弃<br>
 *            CLASS：注解在class文件中可用，但会被VM丢弃<br>
 *            RUNTIME：VM将在运行期间保留注解，因此可以通过反射机制读取注解的信息
 * 
 */
public class UseCase {
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface UseCases {
		public String id();
		public String description() default "no description";
	}
}
