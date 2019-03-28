package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.List;

/**
 * Author: 江云飞
 * Date:   2019/3/28
 */

@Entity
@ApiModel("商品大类")
public class BigCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "商品大类ID",example = "1")
    private Integer id;


    @ApiModelProperty(value = "商品大类名")
    @Column(name = "big_category_name")
    private  String bigCategoryName;

    /*子级分类*/
    @ApiModelProperty(value = "子分类")
    @OneToMany(mappedBy = "bigCategory",cascade=CascadeType.ALL,fetch= FetchType.LAZY)
    private List<SecondaryCategory> SecondaryCategoryList;


}