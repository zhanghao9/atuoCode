package com.code.generate.model;



import java.util.HashMap;
import java.util.Map;


public class ColumnInfo extends Column {

    private static final Map<Integer, String> javaTypeMap = new HashMap<Integer, String>();

    static {
        javaTypeMap.put(JdbcType.FLOAT.typeCode, "Float");
        javaTypeMap.put(JdbcType.INTEGER.typeCode, "Inteter");
        javaTypeMap.put(JdbcType.BIGINT.typeCode, "Long");
        javaTypeMap.put(JdbcType.DATE.typeCode, "Date");

        javaTypeMap.put(JdbcType.DOUBLE.typeCode, "Double");
        javaTypeMap.put(JdbcType.TINYINT.typeCode, "Integer");
        javaTypeMap.put(JdbcType.TIMESTAMP.typeCode, "Date");
        javaTypeMap.put(JdbcType.TIME.typeCode, "String");

        javaTypeMap.put(JdbcType.NCHAR.typeCode, "String");
        javaTypeMap.put(JdbcType.NVARCHAR.typeCode, "String");
        javaTypeMap.put(JdbcType.CLOB.typeCode, "String");
        javaTypeMap.put(JdbcType.NCLOB.typeCode, "String");

        javaTypeMap.put(JdbcType.CHAR.typeCode, "String");
        javaTypeMap.put(JdbcType.VARCHAR.typeCode, "String");
        javaTypeMap.put(JdbcType.LONGVARCHAR.typeCode, "String");
        javaTypeMap.put(JdbcType.LONGVARBINARY.typeCode, "String");
    }

    public static final int QUERT_TYPE_FULL = 1;
    public static final int QUERT_TYPE_FUZZT = 2;

    private Integer queryType;
    private String fieldName;


    public ColumnInfo(Integer queryType) {
        this.queryType = queryType;
    }

    public Integer getQueryType() {
        return queryType;
    }

    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
