package com.nowcoder.community.entity;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/02/17:32
 * @Description:
 */
// ��װ��ҳ��ص���Ϣ
public class Page {
    // ��ǰҳ��
    private int current = 1;
    // ��ʾ������
    private int limit = 10;
    // �������������ڼ����ܵ�ҳ����
    private int rows;
    // ��ѯ·��,���ڸ��÷�ҳ����
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    // ��ȡ��ǰҳ����ʼ��
    public int getOffset() {
        // current*limit-limit
        return (current - 1) * limit;
    }

    // ��ȡ��ҳ��
    public int getTotal() {
        // rows/limit +1;
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

    // ��ȡ��ʼҳ��
    public int getFrom() {
        int from = current - 2;
        return Math.max(from, 1);
    }

    // ��ȡ����ҳ��
    public int getTo() {
        int to = current + 2;
        int total = getTotal();
        return Math.min(to, total);
    }
}
