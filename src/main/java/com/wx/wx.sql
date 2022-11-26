DROP TABLE IF EXISTS wx_employees_list_info;
CREATE TABLE wx_employees_list_info(
	id_wx_employees_list_info bigint(20) NOT NULL COMMENT '主键id',
	employee_name VARCHAR(50) COMMENT '员工姓名',
	employee_code VARCHAR(50) COMMENT '员工编码',
	created_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '创建人',
	created_date datetime(0) NOT NULL DEFAULT now() COMMENT '创建时间',
	updated_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '更新人',
	updated_date datetime(0) NOT NULL DEFAULT now() COMMENT '更新时间',
	is_deleted VARCHAR(1) DEFAULT '0' COMMENT '是否删除',
	PRIMARY KEY(id_wx_employees_list_info)
);

DROP TABLE IF EXISTS wx_sales_platfrom_list_info;
CREATE TABLE wx_sales_platfrom_list_info(
	id_wx_sales_platfrom_list_info bigint(20) NOT NULL COMMENT '主键id',
	sales_platform_code  	VARCHAR(50) COMMENT '销售平台编码',
	sales_platform_name   VARCHAR(50) COMMENT '销售平台名称',
	created_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '创建人',
	created_date datetime(0) NOT NULL DEFAULT now() COMMENT '创建时间',
	updated_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '更新人',
	updated_date datetime(0) NOT NULL DEFAULT now() COMMENT '更新时间',
	is_deleted VARCHAR(1) DEFAULT '0' COMMENT '是否删除',
	PRIMARY KEY(id_wx_sales_platfrom_list_info)
);


DROP TABLE IF EXISTS wx_sales_list_info;
CREATE TABLE wx_sales_list_info(
	id_wx_sales_list_info bigint(20) NOT NULL COMMENT '主键id',
	brand_type_code  	VARCHAR(50) COMMENT '销售平台编码',
	brand_type_name   VARCHAR(50) COMMENT '销售平台名称',
	brand_code   VARCHAR(50) COMMENT '品牌编号',
	brand_name   VARCHAR(50) COMMENT '品牌名称',
	sales_model   VARCHAR(50) COMMENT '销售型号',
	sales_number  DECIMAL(10,2) COMMENT '销售数量',
	sales_price   DECIMAL(10,2) COMMENT '销售单价',
	sales_total_price   DECIMAL(10,2) COMMENT '销售总价',
	sales_date   datetime(0)  NOT NULL DEFAULT  now() COMMENT '销售日期',
	customer_name   VARCHAR(50) COMMENT '顾客姓名',
	customer_tel   VARCHAR(50) COMMENT '顾客电话',
	customer_addr   VARCHAR(50) COMMENT '顾客地址',
	sales_platform_code   VARCHAR(50) COMMENT '销售平台编码',
	employee_code   VARCHAR(50) COMMENT '员工编码',
	created_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '创建人',
	created_date datetime(0) NOT NULL DEFAULT now() COMMENT '创建时间',
	updated_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '更新人',
	updated_date datetime(0) NOT NULL DEFAULT now() COMMENT '更新时间',
	is_deleted VARCHAR(1) DEFAULT '0' COMMENT '是否删除',
	PRIMARY KEY(id_wx_sales_list_info)
);

DROP TABLE IF EXISTS wx_brand_type_list_info;
CREATE TABLE wx_brand_type_list_info(
	id_wx_brand_type_list_info bigint(20)  AUTO_INCREMENT  NOT NULL COMMENT '主键id',
	brand_type_code VARCHAR(50) COMMENT '品牌类型编号',
	brand_type_name VARCHAR(50) COMMENT '品牌类型名称',
	created_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '创建人',
	created_date datetime(0) NOT NULL DEFAULT now() COMMENT '创建时间',
	updated_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '更新人',
	updated_date datetime(0) NOT NULL DEFAULT now() COMMENT '更新时间',
	is_deleted VARCHAR(1) DEFAULT '0' COMMENT '是否删除',
	PRIMARY KEY(id_wx_brand_type_list_info)
);

DROP TABLE IF EXISTS wx_brand_list_info;
CREATE TABLE wx_brand_list_info(
	id_wx_brand_list_info bigint(20)  AUTO_INCREMENT  NOT NULL COMMENT '主键id',
	brand_code VARCHAR(50) COMMENT '品牌编号',
	brand_name VARCHAR(50) COMMENT '品牌名称',
	brand_type_code VARCHAR(50) COMMENT '品牌类型编号',
	created_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '创建人',
	created_date datetime(0) NOT NULL DEFAULT now() COMMENT '创建时间',
	updated_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '更新人',
	updated_date datetime(0) NOT NULL DEFAULT now() COMMENT '更新时间',
	is_deleted VARCHAR(1) DEFAULT '0' COMMENT '是否删除',
	PRIMARY KEY(id_wx_brand_list_info)
);

DROP TABLE IF EXISTS wx_sales_platform_list_info;
CREATE TABLE wx_sales_platform_list_info(
	id_wx_sales_platform_list_info bigint(20)  AUTO_INCREMENT  NOT NULL COMMENT '主键id',
	sales_platform_code VARCHAR(50) COMMENT '销售平台编码',
	sales_platform_Name VARCHAR(50) COMMENT '销售平台名称',
	created_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '创建人',
	created_date datetime(0) NOT NULL DEFAULT now() COMMENT '创建时间',
	updated_by VARCHAR(50) NOT NULL DEFAULT 'sys' COMMENT '更新人',
	updated_date datetime(0) NOT NULL DEFAULT now() COMMENT '更新时间',
	is_deleted VARCHAR(1) DEFAULT '0' COMMENT '是否删除',
	PRIMARY KEY(id_wx_sales_platform_list_info)
);