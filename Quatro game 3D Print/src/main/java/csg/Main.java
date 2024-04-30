package csg;

import org.abstractica.javacsg.*;


public class Main {
    public static void main(String[] args) {
        JavaCSG csg = JavaCSGFactory.createNoCaching();

        Board board = new Board(40,10,200);

        Geometry3D boardResult = board.getBoard(csg);

        csg.view(boardResult,0);

    }
}
