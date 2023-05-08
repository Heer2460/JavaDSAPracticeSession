package com.binary.tree;

import java.sql.SQLException;

public class abc {
    enum State {
        COMPLETE {
            boolean isFinished() { return true; }
        },
        IN_PROGRESS {
            boolean isFinished() { return true; }
        },
        NOT_STARTED {
            boolean isFinished() { return false; }
        };

         abstract boolean isFinished();
    }
}
