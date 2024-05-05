package JavaDesignPatterns;

import JavaDesignPatterns.Momento.Editor;
import JavaDesignPatterns.Momento.History;
import JavaDesignPatterns.State.Abuse.StopWatch;
import JavaDesignPatterns.State.BrushTool;
import JavaDesignPatterns.State.Canvas;
import JavaDesignPatterns.State.EraserTool;
import JavaDesignPatterns.State.SelectionTool;

import javax.swing.plaf.PanelUI;
import java.net.CacheRequest;

public class Main {
    public static void main(String[] args) {

        var stopWatch = new StopWatch();
        stopWatch.click();
        stopWatch.click();
        stopWatch.click();
//    var canvas = new Canvas();
//    canvas.setCurrentTool(new EraserTool() );
//    canvas.mouseDown();
//    canvas.mouseUp();
//        var editor = new Editor();
//        var history = new History();
//        editor.setContent("a");
//        history.push(editor.createState());
//
//        editor.setContent("b");
//        history.push(editor.createState());
//
//        editor.setContent("c");
//        editor.restore(history.pop());
//        editor.restore(history.pop());
//
//        System.out.println(editor.getContent());


//        drawUIControl(new TextBox());
//    var textBox = new TextBox();
//    textBox.enable();
//        var mailService = new MailService();
//        mailService.connect();
//        TaxCalculator calculator = getCalculator();
//        calculator.calculateTax();

//        var account = new Account();
//        account.deposit(10);
//        account.withdraw(5);
//        System.out.println(account.getBalance());

    }
//    public static void drawUIControl (UIControl control) {
//        control.draw();
//    }
//    public static TaxCalculator getCalculator (){
//        return new TaxCalculator2019();
//    }
}