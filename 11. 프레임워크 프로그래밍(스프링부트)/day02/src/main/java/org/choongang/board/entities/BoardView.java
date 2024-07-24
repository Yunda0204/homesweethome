package org.choongang.board.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BoardView {
    @EmbeddedId
    private BoardViewId id;
}

/* 참고하세요
@Data
@Entity
@IdClass(BoardViewId.class)
public class BoardView {
    @Id
    private long seq;

    @Id
    @Column(name = "_uid")
    private int uid;
}
*/