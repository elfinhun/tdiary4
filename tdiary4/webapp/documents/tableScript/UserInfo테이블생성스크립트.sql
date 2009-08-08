create table USER_INFO (
        USER_SEQ	INT  NOT NULL auto_increment,
        USER_ID 	varchar(20)  NOT NULL unique,
        PASSWORD 	varchar (20)  NOT NULL,
	NAME		varchar (100)  NOT NULL,
	PHONE_NO	varchar (20)  DEFAULT "",
	ADDRESS		varchar (255) DEFAULT "" ,
	RESIDENT_NO	varchar (13)  DEFAULT "",
	JOB_CODE	varchar (30)  DEFAULT "",
	SYSTEM_USE_CODE	varchar (30)  DEFAULT "",
	CREATE_DATE	DATETIME  NOT NULL,
	UPDATE_DATE	DATETIME  NOT NULL,	
        PRIMARY KEY (USER_SEQ)
        );

SHOW TABLES;

drop table USER_INFO;

INSERT INTO USER_INFO(USER_ID,PASSWORD,NAME,CREATE_DATE,UPDATE_DATE)
               VALUES('2','2','2',SYSDATE(),SYSDATE());


insert into tdiary4.user_info 
	(USER_SEQ, 
	USER_ID, 
	PASSWORD, 
	NAME, 
	PHONE_NO, 
	ADDRESS, 
	RESIDENT_NO, 
	JOB_CODE, 
	SYSTEM_USE_CODE, 
	CREATE_DATE, 
	UPDATE_DATE
	)
	values
	('USER_SEQ', 
	'USER_ID', 
	'PASSWORD', 
	'NAME', 
	'PHONE_NO', 
	'ADDRESS', 
	'RESIDENT_NO', 
	'JOB_CODE', 
	'SYSTEM_USE_CODE', 
	'CREATE_DATE', 
	'UPDATE_DATE'
	);


COMMIT;

SELECT * FROM USER_INFO;





