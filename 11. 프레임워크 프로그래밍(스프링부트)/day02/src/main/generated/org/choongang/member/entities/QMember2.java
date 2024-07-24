package org.choongang.member.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember2 is a Querydsl query type for Member2
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember2 extends EntityPathBase<Member2> {

    private static final long serialVersionUID = 367394691L;

    public static final QMember2 member2 = new QMember2("member2");

    public final NumberPath<Integer> num = createNumber("num", Integer.class);

    public final NumberPath<Integer> random = createNumber("random", Integer.class);

    public QMember2(String variable) {
        super(Member2.class, forVariable(variable));
    }

    public QMember2(Path<? extends Member2> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember2(PathMetadata metadata) {
        super(Member2.class, metadata);
    }

}

