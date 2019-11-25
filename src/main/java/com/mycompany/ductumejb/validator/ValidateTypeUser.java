package com.mycompany.ductumejb.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target( {ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidatorTypeUser.class)
@Documented
public @interface ValidateTypeUser{
    String message() default "{Entity.Enum.TypeUser}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
