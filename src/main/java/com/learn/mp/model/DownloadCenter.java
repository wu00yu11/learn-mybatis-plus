package com.learn.mp.model;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * t_download_center
 * @author 
 */
@TableName("t_download_center")
public class DownloadCenter implements Serializable {
    /**
     * 主键
     */
    @TableField(fill = FieldFill.INSERT)
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 机构号
     */
    private String orgCode;

    /**
     * 模板名称
     */
    private String tempName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人ID
     */
    private Long createrId;

    /**
     * 用户登录Id
     */
    private String loginId;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 执行状态 0:处理中,1:已完成,2.失败
     */
    private Byte execStatus;

    /**
     * 上传FSS文件接口会返回
     */
    private String fssid;

    /**
     * fss文件系统不会记录文件类型
     */
    private String fileType;

    /**
     * 文件有效期
     */
    private String validity;

    /**
     * 是否首次下载第一次下载:=1是；=0 否
     */
    private Byte firstdown;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Byte getExecStatus() {
        return execStatus;
    }

    public void setExecStatus(Byte execStatus) {
        this.execStatus = execStatus;
    }

    public String getFssid() {
        return fssid;
    }

    public void setFssid(String fssid) {
        this.fssid = fssid;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public Byte getFirstdown() {
        return firstdown;
    }

    public void setFirstdown(Byte firstdown) {
        this.firstdown = firstdown;
    }
}