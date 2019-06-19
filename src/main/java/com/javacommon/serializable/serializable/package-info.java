/*
 * 测试serialVersionUID：
 *  无serialVersionUID时，系统根据类的属性生成serialVersionUID，属性变更时，默认serialVersionUID变更
 *  序列化/反序列化，父类和子类的属性都以自己的serialVersionUID解析，serialVersionUID不对应报错
 **/
package com.javacommon.serializable.serializable;