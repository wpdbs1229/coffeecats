package org.hidevelop.coffeecats.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "cafe")
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class CafeEntity extends BaseEntity {

    @Id
    private String cafeId;

    @Column(nullable = false)
    private String cafeName;

    private String cafeDescription;

    @Column(nullable = false, unique = true)
    private String address;

    @Comment("카페 위도")
    @Column(nullable = false)
    private double latitude;

    @Comment("카페 경도")
    @Column(nullable = false)
    private double longitude;

    @Comment("위도, 경도 해싱")
    @Column(nullable = false)
    private String geoHash;

    @Comment("카페를 등록한 유저")
    private Long registerMember;

    public void updateCafeDescription(String cafeDescription) {
        this.cafeDescription = cafeDescription;
    }
}
