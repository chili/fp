package pub.xplus.fp.file.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by AllenYe on 2016/9/19.
 */
@Target(ElementType.FIELD)
public @interface ItemDesc {
    /**
     * 名称
     *
     * @return
     */
    public String name() default "";

    /**
     * 长度
     *
     * @return
     */
    public int size();

    /**
     * 类型
     *
     * @return
     */
    public ItemType type() default ItemType.STRING;

}
