package examples.chess;

import frame.Controller.Game;
import frame.board.BasePiece;
import frame.util.Point2D;

import java.util.ArrayList;

public class Piece extends BasePiece {
    public enum PieceType {
        JU,
        MA,
        XIANG,
        HOU,
        WANG,
        BING
    }

    private PieceType type;
    private final Color color;

    public Piece(int x, int y, PieceType type, Color color) {
        super(x, y);
        this.type = type;  //类型//
        this.color = color;
    }

    private Color checkBoardPosition(int x, int y) {
        BasePiece piece = Game.getBoard().getGrid(x, y).getOwnedPiece();
        if (piece == null) {
            return Color.NULL;
        }
        return ((Piece) piece).color;
    }

    public ArrayList<Point2D> getAvailablePositions() {
        ArrayList<Point2D> result = new ArrayList<>();
        switch (type) {
            case JU:
                for (int i = y + 1; i < 8; i++) {
                    if (checkBoardPosition(x, i) == color) break;
                    result.add(new Point2D(x, i));
                    if (checkBoardPosition(x, i) != Color.NULL) break;
                }
                for (int i = y - 1; i >= 0; i--) {
                    if (checkBoardPosition(x, i) == color) break;
                    result.add(new Point2D(x, i));
                    if (checkBoardPosition(x, i) != Color.NULL) break;
                }
                for (int i = x + 1; i < 8; i++) {
                    if (checkBoardPosition(i, y) == color) break;
                    result.add(new Point2D(i, y));
                    if (checkBoardPosition(i, y) != Color.NULL) break;
                }
                for (int i = x - 1; i >= 0; i--) {
                    if (checkBoardPosition(i, y) == color) break;
                    result.add(new Point2D(i, y));
                    if (checkBoardPosition(i, y) != Color.NULL) break;
                }
                break;
            case MA:
                result.add(new Point2D(x + 1, y + 2));
                result.add(new Point2D(x + 1, y - 2));
                result.add(new Point2D(x - 1, y + 2));
                result.add(new Point2D(x - 1, y - 2));
                result.add(new Point2D(x + 2, y + 1));
                result.add(new Point2D(x + 2, y - 1));
                result.add(new Point2D(x - 2, y + 1));
                result.add(new Point2D(x - 2, y - 1));
                break;
            case BING:
                if (color == Color.BLACK) {

                    result.add(new Point2D(x, y - 1));



                } else if (color == Color.WHITE) {
                    result.add(new Point2D(x, y + 1));
                    if (y > 4) {
                        result.add(new Point2D(x - 1, y));
                        result.add(new Point2D(x + 1, y));
                    }
                }
                break;
            case XIANG:
                for (int i = 0; i < 8; i++) {
                    if (checkBoardPosition(x+i,y+i) == color) break;
                    result.add(new Point2D(x+i,y+i));
                    if (checkBoardPosition(x+i,y+i) != Color.NULL) break;
                }
                for (int i = 0; i < 8; i++) {
                    if (checkBoardPosition(x-i,y+i) == color) break;
                    result.add(new Point2D(x-i,y+i));
                    if (checkBoardPosition(x-i,y+i) != Color.NULL) break;
                }
                for (int i = 0; i < 8; i++) {
                    if (checkBoardPosition(x+i,y-i) == color) break;
                    result.add(new Point2D(x+i,y-i));
                    if (checkBoardPosition(x+i,y-i) != Color.NULL) break;
                }
                for (int i = 0; i < 8; i++) {
                    if (checkBoardPosition(x - i, y - i) == color) break;
                    result.add(new Point2D(x - i, y - i));
                    if (checkBoardPosition(x - i, y - i) != Color.NULL) break;
                }
        }
        result.removeIf(p -> p.x < 0 || p.x >= 8 || p.y < 0 || p.y >= 8);
        result.removeIf(p -> checkBoardPosition(p.x, p.y) == color);
        return result;
    }

    public Color getColor() {
        return color;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
