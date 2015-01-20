-- 工作日模块初始化数据
-- 2014 年节假日数据
delete from BC_WORKDAY where date_part('year', FROM_DATE) = 2014;
insert into BC_WORKDAY (DAYOFF, FROM_DATE, TO_DATE, DESC_) VALUES
	(true, '2014-01-01', '2014-01-01', '元旦'),
	(true, '2014-01-31', '2014-02-06', '春节'),
	(false, '2014-01-26', '2014-01-26', '春节调休'),
	(false, '2014-02-08', '2014-02-08', '春节调休'),
	(true, '2014-04-05', '2014-04-05', '清明节'),
	(false, '2014-04-07', '2014-04-07', '清明节调休'),
	(true, '2014-05-01', '2014-05-03', '五一劳动节'),
	(false, '2014-05-04', '2014-05-04', '五一劳动节调休'),
	(true, '2014-06-02', '2014-06-02', '端午节'),
	(true, '2014-09-08', '2014-09-08', '中秋节'),
	(true, '2014-10-01', '2014-10-07', '国庆节'),
	(false, '2014-09-28', '2014-09-28', '国庆节调休'),
	(false, '2014-10-11', '2014-10-11', '国庆节调休');

-- 2015 年节假日数据
delete from BC_WORKDAY where date_part('year', FROM_DATE) = 2015;
insert into BC_WORKDAY (DAYOFF, FROM_DATE, TO_DATE, DESC_) VALUES
	(true, '2015-01-01', '2015-01-03', '元旦'),
	(false, '2015-01-04', '2015-01-04', '元旦调休');

-- select * from BC_WORKDAY order by FROM_DATE desc;