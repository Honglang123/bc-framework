/**
 *
 */
package cn.bc.core.query.condition.impl;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author dragon
 */
public class LessThanConditionTest {
  @Test
  public void test() {
    LessThanCondition c = new LessThanCondition("key", new Long(1));
    Assert.assertEquals("key < ?", c.getExpression());
    Assert.assertNotNull(c.getValues());
    Assert.assertTrue(c.getValues().size() == 1);
    Assert.assertEquals(new Long(1), c.getValues().get(0));
  }
}
