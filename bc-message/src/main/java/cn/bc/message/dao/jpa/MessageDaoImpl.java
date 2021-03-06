package cn.bc.message.dao.jpa;

import cn.bc.message.dao.MessageDao;
import cn.bc.message.domain.Message;
import cn.bc.orm.jpa.JpaCrudDao;

/**
 * 消息Dao接口的实现
 *
 * @author dragon
 */
public class MessageDaoImpl extends JpaCrudDao<Message> implements MessageDao {
}