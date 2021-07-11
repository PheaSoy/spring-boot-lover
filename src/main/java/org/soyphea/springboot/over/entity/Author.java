package org.soyphea.springboot.over.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_author")
@Builder
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "author_sequence")

    @Id
    private Long id;

    private String name;

    @Column(name = "twitter_url",length = 100,unique = true)
    private String twitterUrl;

    @Column(name = "email",length = 50,unique = true)
    private String email;

}
