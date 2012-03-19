package fi.hut.soberit.agilefant.db;
import fi.hut.soberit.agilefant.model.DatabaseBackup;
import fi.hut.soberit.agilefant.util.DbConnectionInfo;

public interface DatabaseBackupDAO extends GenericDAO<DatabaseBackup> {
    public DbConnectionInfo getDbInfo();
}
