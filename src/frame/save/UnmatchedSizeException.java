package frame.save;

public class UnmatchedSizeException extends Exception {

    public final int expectedWidth, expectedHeight, realWidth, realHeight;

    public UnmatchedSizeException(int expectedWidth, int expectedHeight, int realWidth, int realHeight) {
        super("错误代码：101； 棋盘并非8*8");
        this.expectedWidth = expectedWidth;
        this.expectedHeight = expectedHeight;
        this.realWidth = realWidth;
        this.realHeight = realHeight;
    }
}
