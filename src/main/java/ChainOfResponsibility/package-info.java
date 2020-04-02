package ChainOfResponsibility;

/**
 * @since 4/2/2020
 * 推卸责任
 *      将多个对象组成一个职责链， 然后按照它们在职责链上的顺序一个一个地找出到底应该谁来负责处理
 *      Touble类负责产生问题, support类负责解决。
 *      在该例中，所有support子类都是平级的，并各自具有特点。
 */