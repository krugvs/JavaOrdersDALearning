package com.dataart.ks.javaschool;

import java.util.ArrayList;

/**
 * Created by vlad on 6/4/14.
 */
public class Category {
    protected String name;
    protected Category parentCategory;
    protected ArrayList<Category> subCategories = new ArrayList();

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, Category parentCategory) {
        this.name = name;
        this.setParent(parentCategory);
        parentCategory.addSubCategory(this);
    }

    public void addSubCategory(Category subCategory){
        subCategory.setParent(this);
        subCategories.add(subCategory);
    }

    protected void setParent(Category parentCategory){
        this.parentCategory = parentCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String s;

        s =  "Category: " + name +"\n ";
        if (subCategories.size()>0) {
            s = s + "\tSubcategories of "+name+":\n ";
            for (Category anCategory : subCategories) {
                s = s + "\t"+anCategory;
            }
            s = s+"\n\r";
        }
        return s;
    }
}
