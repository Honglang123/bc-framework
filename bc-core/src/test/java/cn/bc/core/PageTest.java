package cn.bc.core;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PageTest {
  @Test
  public void test() {
    Page<Object> page = new Page<>(0, 0, 0, null);
    Assert.assertEquals(1, page.getPageNo());
    Assert.assertEquals(1, page.getPageSize());
    Assert.assertEquals(0, page.getTotalCount());
    Assert.assertEquals(0, page.getFirstResult());
    Assert.assertEquals(0, Page.getFirstResult(0, 0));
    Assert.assertEquals(0, page.getPageCount());
    Assert.assertNull(page.getData());

    page = new Page<>(-1, -1, -1, null);
    Assert.assertEquals(1, page.getPageNo());
    Assert.assertEquals(1, page.getPageSize());
    Assert.assertEquals(0, page.getTotalCount());
    Assert.assertEquals(0, page.getFirstResult());
    Assert.assertEquals(0, Page.getFirstResult(-1, -1));
    Assert.assertEquals(0, page.getPageCount());
    Assert.assertNull(page.getData());

    page = new Page<>(1, 50, 101, null);
    Assert.assertEquals(1, page.getPageNo());
    Assert.assertEquals(50, page.getPageSize());
    Assert.assertEquals(101, page.getTotalCount());
    Assert.assertEquals(0, page.getFirstResult());
    Assert.assertEquals(0, Page.getFirstResult(1, 50));
    Assert.assertEquals(3, page.getPageCount());
    Assert.assertNull(page.getData());

    page = new Page<>(2, 50, 100, new ArrayList<>());
    Assert.assertEquals(2, page.getPageNo());
    Assert.assertEquals(50, page.getPageSize());
    Assert.assertEquals(100, page.getTotalCount());
    Assert.assertEquals(50, page.getFirstResult());
    Assert.assertEquals(50, Page.getFirstResult(2, 50));
    Assert.assertEquals(2, page.getPageCount());
    Assert.assertNotNull(page.getData());
  }
}
