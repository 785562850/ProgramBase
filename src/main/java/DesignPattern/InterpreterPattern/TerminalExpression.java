package DesignPattern.InterpreterPattern;

/**
 * 解释器模式 行为型模式
 * 提供了评估语言的语法或表达式的方式，该模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等
 * 意图：给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
 * 解决问题：对于一些固定文法构建一个解释句子的解释器。
 * 使用场景： 1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。
 *          2、一些重复出现的问题可以用一种简单的语言来进行表达。
 *          3、一个简单语法需要解释的场景。
 *  实例：编译器、运算表达式计算
 *  实现方式：构件语法树，定义终结符与非终结符。
 *  构件环境类，包含解释器之外的一些全局信息，一般是 HashMap。
 *  可用jar包expression4J 实现
 */
public class TerminalExpression implements Expression{
   private String data;
    public TerminalExpression(String data){
        this.data = data;
    }
    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
